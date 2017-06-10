package Code;

/**
 * @阵营：草帽海贼团
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Code.Modle.*;

public class OnePiece extends OnePiecePerson {

	public Scanner input = new Scanner(System.in);

	boolean ck = true;

	List<OnePiecePerson> caoMao = new ArrayList<OnePiecePerson>();

	public OnePiece() {
	}

	public OnePiece(String name, int blood, String sex, String camp, String job, String skill) {
		super(name, blood, sex, camp, job, skill);
	}

	/*
	 * ������ֵ
	 */
	public void showInfo() {
		/*
		 * ���������ʼ
		 */
		caoMao.add(new OnePiecePerson("���桤D��·��", 100, "��", "��ñ������", "����", "�𽺹�ʵ"));
		caoMao.add(new OnePiecePerson("����ŵ�ǡ���¡", 100, "��", "��ñ������", "��Ա", "��������ʿ	"));
		caoMao.add(new OnePiecePerson("����", 100, "Ů", "��ñ������", "����ʿ", "����"));
		caoMao.add(new OnePiecePerson("ɽ��", 100, "��", "��ñ������", "����", "����"));
		caoMao.add(new OnePiecePerson("������", 100, "��", "��ñ������", "�ѻ���", "����"));
		caoMao.add(new OnePiecePerson("�������ᡤ�ǰ�", 100, "ѱ¹", "��ñ������", "��ҽ", "���˹�ʵ"));
		caoMao.add(new OnePiecePerson("�ݿɡ��ޱ�", 100, "Ů", "��ñ������", "��ʷѧ��", "��ʵ"));
		caoMao.add(new OnePiecePerson("������", 100, "��", "��ñ������", "����", "������"));
		caoMao.add(new OnePiecePerson("��³��", 100, "����", "��ñ������", "���ּ�", "��Ȫ��ʵ"));
		/*
		 * �˵�ѭ��
		 */
		do {
			System.out.println("**********��ñ������**********");
			System.out.println("��ñ������Ŀǰ��" + caoMao.size() + "��");
			System.out.println("***********��ϸ����***********");
			show(caoMao);

			addcaoMao();
			System.out.println("�Ƿ������");
			System.out.println("(1.����/2.�˳�)");
			int choose = input.nextInt();
			if (choose == 1) {
				ck = true;
			} else if (choose == 2) {
				ck = false;
				break;
			} else {
				System.out.println("ѡ���������������");
				ck = true;
			}
		} while (ck);

		System.exit(0);
	}

	/*
	 * ��ʾѭ��
	 */
	public static void show(List<OnePiecePerson> caoMao) {
		for (OnePiecePerson caoMao1 : caoMao) {
			System.out.println("��Ӫ��" + caoMao1.getCamp());
			System.out.println("\tְ��" + caoMao1.getJob());
			System.out.println("\t\t������" + caoMao1.getName());
			System.out.println("\t\t����ֵ��" + caoMao1.getBlood());
			System.out.println("\t\t�Ա�" + caoMao1.getSex());
			System.out.println("\t\t������" + caoMao1.getSkill());

		}
	}

	/*
	 * �������
	 */
	void addcaoMao() {
		System.out.println("��������ӳ�Ա��");
		System.out.println("��Ӫ��");
		String camp = input.next();
		System.out.println("ְ��");
		String job = input.next();
		System.out.println("������");
		String name = input.next();
		System.out.println("�Ա�");
		String sex = input.next();
		System.out.println("������");
		String skill = input.next();
		OnePiecePerson a = new OnePiecePerson(name, 100, sex, camp, job, skill);
		caoMao.add(a);
	}

	void ranDom(List<OnePiecePerson> caoMao) {
		//for (int i = 0; i < caoMao.size(); i++) {
		int i=(int) (Math.random()*8);
			System.out.println("��Ӫ��" + ((caoMao.get(i))).getCamp());
			System.out.println("\tְ��" + ((caoMao.get(i))).getJob());
			System.out.println("\t\t������" + ((caoMao.get(i))).getName());
			System.out.println("\t\t����ֵ��" + ((caoMao.get(i))).getBlood());
			System.out.println("\t\t�Ա�" + ((caoMao.get(i))).getSex());
			System.out.println("\t\t������" + ((caoMao.get(i))).getSkill());
		//}
	}
}
