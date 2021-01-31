import adapterPattern.*;
import observerPattern.Observer;
import observerPattern.User;
import observerPattern.WechatServer;
import statePattern.BookedState;
import statePattern.FreeState;
import statePattern.HomeContext;
import staticFactoryPattern.Login;
import staticFactoryPattern.LoginManager;
import strategyPattern.ConcreteStrategyB;
import strategyPattern.Context;
import strategyPattern.Strategy;
import templatePattern.Account;
import templatePattern.CDAccount;
import templatePattern.MoneyMarketAccount;

import java.io.File;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static long randomTime() {
        return (long) (Math.random() * 1000);
    }

    public static void main(String[] args) {
//        //二分查找
//        int[] a = {1, 2, 3, 4, 5, 6, 12, 43, 88, 99};
////        int val = BinarySearch.circulateSearch(a, 88); //非递归方式
////        System.out.println("二分法查找：非递归方式查找数据所在下标位置为："+ val);
//        int val = BinarySearch.recursionSearch(a, 0, a.length - 1, 43); //递归方式
//        System.out.println("二分法查找：递归方式查找数据所在下标位置为：" + val);
//
//        //求素数个数
//        int num = getPrime(101, 200);
//        System.out.println("101~200之间的素数个数为：" + num);
//
//        //斐波那契数列 1,1,2,3,5,8,13,21
//        //int fib = FibonacciSequence.getRecursion(7);//递归
//        int fib = FibonacciSequence.getRecursion(7);//非递归
//        System.out.println("第n位斐波那契数列值为：" + fib);
//
//        //求一个字符串在另一个字符串中出现的次数
//        String strA = "ljosdbdaliabdaalsllnohupbdaps-es";
//        String strB = "bda";
//        int count = hit(strA, strB);
//        System.out.println("计算一个字符串在另一个字符串中出现的次数：" + count);
//
//        //归并排序
//        int[] merArr = {12, 4, 8, 23, 1, -1, 48, 32, 64};
//        Sort.mergeSort(merArr, 0, merArr.length - 1);
//        System.out.println("归并排序后的数组结果：" + Arrays.toString(merArr));
//
//        //快排
//        int quickArr[] = new int[]{3, 3, 3, 7, 9, 122344, 4656, 34, 34, 4656, 5, 6, 7, 8, 9, 343, 57765, 23, 12321};
//        Sort.quickSort(quickArr, 0, quickArr.length - 1);
//        System.out.println("快排后的数组结果为：" + Arrays.toString(quickArr));
//
//        //合并两个有序集合
//        int[] merA = new int[]{4, 8, 23, 56, 88};
//        int[] merB = new int[]{1, 5, 22, 56, 99};
//        int[] merRes = Sort.mergeArr(merA, merB);
//        System.out.println("合并两个有序集合：" + Arrays.toString(merRes));
//
//        //单链表反转(明天确定)
//
//
//        //两个线程交替打印，同一个Runnable下的run方法 两个线程交替打印1-100
////        Ticket base = new Ticket();
////        new Thread(base, "A").start();
////        new Thread(base, "B").start();
//        //两个线程同时操作一个数，一个加，一个减(生产者-消费者模式) //阻塞队列实现
//        final MyData data = new MyData();
//        int k = 2;
//        while (k > 0) {
//            new Thread(() -> data.add()).start();
//            new Thread(() -> data.dec()).start();
//            k--;
//        }
//
//        ShareData sd = new ShareData();
//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    sd.increment();
//                } catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }, "AA").start();
//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    sd.decrement();
//                } catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }, "BB").start();
//
//        //字母异位分词
//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> mapList = getAna(strs);
//        System.out.println("字母异位分词结果：" + Arrays.toString(mapList.toArray()));
//
//        //字符串转换
//        String strCha = changeStr("abaaldlrt");
//        System.out.println("字符串转换结果：" + strCha);
//
//        //单例
//        SingleHungry.getInstance();
//        SingletonLazy.getInstance();
//
//        //状态模式
//        HomeContext context = new HomeContext();
//        context.setState(new FreeState());
//        context.setState(new BookedState());
//
//        //策略模式
//        Strategy strategy = new ConcreteStrategyB();
//        Context cxt = new Context(strategy);
//        cxt.contextInterface();
//
//        //简单工厂模式
//        String loginType = "password";
//        String name = "name";
//        String password = "password";
//        Login login = LoginManager.factory(loginType);
//        boolean bool = login.verify(name, password);
//        if (bool) {
//        } else {
//        }
//
//        //模板方法模式
//        Account account = new MoneyMarketAccount();
//        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
//        account = new CDAccount();
//        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
//
//        //观察者模式(四个角色：抽象被观察角色、抽象观察者角色、具体观察者角色、具体被观察者角色；场景：微信公众号服务，推送消息)
//        WechatServer server = new WechatServer();
//
//        Observer userZhang = new User("张三");
//        Observer userLi = new User("李四");
//        Observer userWang = new User("王五");
//        server.registerObserver(userZhang);
//        server.registerObserver(userLi);
//        server.registerObserver(userWang);
//        server.setInfomation("PHP是世界上最好的语言！");
//        System.out.println("-----------------------------------");
//        server.removeObserver(userZhang);
//        server.setInfomation("JAVA是世界上最好的语言！");
//
//
//        //适配器 (三种：类适配器、对象适配器、接口适配器)
//        System.out.println("------------第一种适配器------------");
//        Vga vga = new Typec2Vga1();
//        vga.vgaInterface();
//        System.out.println("显示屏对接适配器，手机成功投影到显示屏！");
//
//        System.out.println("------------第二种适配器-------------");
//        Typec2Vga2 typec2Vga1 = new Typec2Vga2(new Phone());
//        typec2Vga1.vgaInterface();
//        System.out.println("显示屏对接适配器，手机成功投影到显示屏！");
//
//        System.out.println("------------第三种适配器-------------");
//        VgaAdapter vgaAdapter = new VgaAdapter();
//        vgaAdapter.typec();
//        vgaAdapter.typec2vga();
//        System.out.println("显示屏对接适配器，手机成功投影到显示屏！");
//
//
//        //遍历arraylist时移除一个元素
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("bb");
//        list.add("bb");
//        list.add("ccc");
//        list.add("ccc");
//        list.add("ccc");
//        for (int i = list.size() - 1; i >= 0; i--) {
//            String s = list.get(i);
//            if (s.equals("bb")) {
//                list.remove(s);
//            }
//        }
//        System.out.println("list集合元素为：" + Arrays.toString(list.toArray()));
//
//        //ThreadLocal应用实例
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread1 = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable);
//        thread1.start();
//        thread2.start();

        // 能容纳100个文件
        final BlockingQueue<File> queue = new LinkedBlockingQueue<File>(100);
        // 线程池
        final ExecutorService exec = Executors.newFixedThreadPool(5);
        final File root = new File("F:\\JavaLib");
        // 完成标志
        final File exitFile = new File("");
        // 读个数
        final AtomicInteger rc = new AtomicInteger();
        // 写个数
        final AtomicInteger wc = new AtomicInteger();
        // 读线程
        Runnable read = new Runnable() {
            @Override
            public void run() {
                scanFile(root);
                scanFile(exitFile);
            }

            public void scanFile(File file) {

            }

        };
        exec.submit(read);
        // 四个写线程
        for (int index = 0; index < 4; index++) {
            final int NO = index;
            Runnable write = new Runnable() {
                String threadName = "Write" + NO;

                @Override
                public void run() {

                }
            };
        }

    }

    private static String changeStr(String str) {
        if (str == null || str.length() == 0) return "";
        char[] chs = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : chs) {
            if (!map.containsKey(ch)) {
                map.put(ch, 0);
            }
            map.put(ch, map.get(ch) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getValue().toString() + entry.getKey());
        }
        return sb.toString();
    }

    /**
     * 字母异位分词
     */
    private static List<List<String>> getAna(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>(16);
        for (String str : strs) {
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String key = String.valueOf(chs);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    /**
     * 单链表反转
     */
    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 计算一个字符串在另一个字符串中出现的次数
     */
    private static int hit(String a, String b) {
        if (a.length() < b.length()) {
            return 0;
        }
        int count = 0;
        char[] chs = a.toCharArray();
        for (int i = 0; i < (a.length() - b.length()); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < b.length(); j++) {
                sb.append(chs[i + j]);
            }
            if (sb.toString().equals(b)) {
                count++;
            }
        }
        return count;
    }

    /**
     * 求素数
     */
    private static int getPrime(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean b = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b) {
                count++;
            }
        }
        return count;
    }
}
