import java.util.*;
class Interval {
	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;

	}
	public String toString() {
		return "{" + this.start + "," + this.end + "}";
	}
}

public class OverlappingIntervals {
	public static List<Interval> merge(List<Interval> intervals) {
		if (intervals.size() < 2) {
			return intervals;
		}
		intervals.sort(Comparator.comparingInt(in-> in.start));
		List<Interval> result = new LinkedList<>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;

		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);

			if (current.start <= end) {
				end = Math.max(end, current.end);
			} else {
				result.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}

		}
		result.add(new Interval(start, end));
		return result;

	}

	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		if (intervals == null || intervals.isEmpty()){
			return intervals;
		}
		List<Interval> result = new LinkedList<>();
		int i = 0;
		while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
			result.add(intervals.get(i));
			i++;
		}
		while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
			Interval current = intervals.get(i);
			newInterval.start = Math.min(current.start,newInterval.start);
			newInterval.end = Math.max(current.end, newInterval.end);
			i++;
		}
		result.add(newInterval);
		while (i < intervals.size()) {
			result.add(intervals.get(i));
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		Interval i1 = new Interval(2, 5);
		Interval i2 = new Interval(0, 3);
		Interval i3 = new Interval(5, 7);
		Interval i4 = new Interval(8, 10);
		Interval i5 = new Interval(8, 12);
		Interval i6 = new Interval(14, 16);

		List<Interval> l1 = new LinkedList<>();
		l1.add(i1);
		l1.add(i2);
		l1.add(i3);
		l1.add(i4);
		l1.add(i5);
		l1.add(i6);
		List <Interval> mList = merge(l1);
		List <Interval> l2 = insert(mList,new Interval(3,8));
		for (Interval interval : l2) {
			System.out.print(interval + " ");
		}
	}
}