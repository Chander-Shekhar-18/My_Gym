package com.example.my_gym;

import java.util.ArrayList;

public class Utils {

    private static ArrayList<Training> trainings;

    private static ArrayList<Plan> plans;

    public static void initTrainings() {
        if (null == trainings) {
            trainings = new ArrayList<>();
        }

        Training pushUP = new Training(1, "Push Up", "A push-up is a common calisthenics exercise beginning from the prone position.",
                "A push-up (or press-up if the hands are wider than shoulders placing more emphasis on the pectoral muscles is a common calisthenics exercise beginning from the prone position. By raising and lowering the body using the arms, push-ups exercise the pectoral muscles, triceps, and anterior deltoids, with ancillary benefits to the rest of the deltoids, serratus anterior, coracobrachialis and the midsection as a whole. Push-ups are a basic exercise used in civilian athletic training or physical education and commonly in military physical training. They are also a common form of punishment used in the military, school sport, and some martial arts disciplines. While the push-up primarily targets the muscles of the chest, arms, and shoulders, support required from other muscles results in a wider range of muscles integrated into the exercise.",
                "https://media1.popsugar-assets.com/files/thumbor/_7Tm-E9UqiwRZbNlY8ItXL5wU2k/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/2017/04/20/838/n/1922729/482d4566494adf6f_8589c22c445d63e2_0e7e9800cb65fd44_Tricep-Push-Up.jpg");
        trainings.add(pushUP);
        Training squat = new Training(2, "Squat", "A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up.",
                "A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up. During the descent of a squat, the hip and knee joints flex while the ankle joint dorsiflexes; conversely the hip and knee joints extend and the ankle joint plantarflexes when standing up.\n" +
                        "\n" +
                        "Squats are considered a vital exercise for increasing the strength and size of the lower body muscles as well as developing core strength. The primary agonist muscles used during the squat are the quadriceps femoris, the adductor magnus, and the gluteus maximus.[1] The squat also isometrically uses the erector spinae and the abdominal muscles, among others.[2]\n" +
                        "\n" +
                        "The squat is one of the three lifts in the strength sport of powerlifting, together with the deadlift and the bench press. It is also considered a staple exercise in many popular recreational exercise programs.",
                "https://www.runtastic.com/blog/wp-content/uploads/2018/07/how-to-squat-common-mistakes-1200x800-1-1024x683.jpg");
        trainings.add(squat);
        Training legPress = new Training(3, "Leg Press", "The leg press is excellent at building some of the most important muscles in your legs including your glutes, quadriceps, and hamstrings.",
                "The leg press is a weight training exercise in which the individual pushes a weight or resistance away from them using their legs. The term leg press also refers to the apparatus used to perform this exercise. The leg press can be used to evaluate an athlete's overall lower body strength (from knee joint to hip). It has the potential to inflict grave injury: the knees could bend the wrong way if they are locked during a leg press.\n" +
                        "\n" +
                        "\n" +
                        "There are two main types of leg press:\n" +
                        "\n" +
                        "The diagonal or vertical 'sled' type leg press. Weight disks (plates) are attached directly to the sled, which is mounted on rails. The user sits below the sled and pushes it upward with their feet. These machines normally include adjustable safety brackets that prevent the user from being trapped under the weight.\n" +
                        "The 'cable' type leg press, or 'seated leg press', commonly found on multigyms. The user sits upright and pushes forward with their feet onto a plate that is attached to the weight stack by means of a long steel cable.",
                "https://www.oxygenmag.com/.image/t_share/MTQ1MzQ3MzE1OTU0OTUxOTUz/image-placeholder-title.jpg");
        trainings.add(legPress);
        Training pullUps = new Training(4, "Pull Ups", "Pullups also strengthen the arm and shoulder muscles. By performing pullups regularly, you'll work the forearms and shoulders.",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.\n" +
                        "\n" +
                        "The term chin-up, traditionally referring to a pull-up with the chin brought over the top of a bar, was used in the 1980s to refer to a pronated, or overhand, grip, with a supinated, or underhand, grip being called a \"reverse-grip\" chin-up.In later decades, this usage has inverted, with some using \"chin-up\" to refer to a pull-up done with a supinated hand position[5], while \"pull-up\" refers specifically to the exercise done with a pronated hand position.[6]\n" +
                        "\n" +
                        "Pull-ups use many different muscles of the upper body, including the latissimus dorsi and the biceps brachii.",
                "https://www.climbing.com/.image/t_share/MTM3MzI0NDMzMjY5MzM1MjA5/trainingperfectpullupsjpg.jpg");
        trainings.add(pullUps);
        Training SkippingRope = new Training(5, "Skipping Rope", "Skipping is an excellent idea to lose weight because it involves all the body muscles.",
                "A skipping rope (British English) or jump rope (American English) is a tool used in the sport of skipping/jump rope where one or more participants jump over a rope swung so that it passes under their feet and over their heads. There are multiple subsets of skipping/jump rope, including single freestyle, single speed, pairs, three-person speed (Double Dutch), and three-person freestyle (Double Dutch freestyle). Often separated by sex and age, events include hundreds of competitive teams all around the world. There are a few major organizations that support jump rope as a sport as seen below. In the US, schools rarely have jump rope teams, and states do not sanction official events for high school or elementary school. In freestyle events, jumpers use a variety of basic and advanced techniques in a routine of one minute, which is judged by a head judge, content judges, and performance judges. In speed events, a jumper alternates their feet with the rope going around the jumper every time one of their feet hit the ground for 30 seconds, one minute, or three minutes. The jumper is judged on the number of times the right foot touches the ground in those times.",
                "https://cdn2.stylecraze.com/wp-content/uploads/2014/07/Is-Rope-Jumping-Good-For-Health-Benefits-And-Precautions.jpg");
        trainings.add(SkippingRope);
        Training SidePlanks = new Training(6, "Side Planks", "The Side Plank primarily strengthens the obliques, which are located next to your abs on both sides of your body.",
                "The side plank is a great exercise for strengthening the oblique abdominal muscles, which don't get worked during ab exercises such as crunches. You will hold your body on your side in straight position supported only by one arm and the side of one foot. Strong obliques can be quite useful as core stabilization muscles. Beginners must build the strength and balance needed with warmups for the obliques and modified side planks before progressing to the side plank. You can include side planks in your core exercise routine, Pilates, or yoga practice.The primary muscles used are the obliques, along with the gluteus medius and gluteus maximus to stabilize the hips. Your shoulder stabilizers keep you aligned as well. This exercise doesn't put pressure on your lower back or neck as many core exercises do. In pregnancy, the side plank is preferred as it places less stress on the center abdominal muscles. It is a balancing exercise and you will be building your balance and coordination. This exercise can help you be able to sustain good posture and ease of movement by building a strong core and better balance.",
                "https://3i133rqau023qjc1k3txdvr1-wpengine.netdna-ssl.com/wp-content/uploads/2014/07/Full-Side-Plank_Exercise.jpg");
        trainings.add(SidePlanks);

    }

    public static ArrayList<Training> getTrainings() {
        return trainings;
    }

    public static boolean addPlan(Plan plan){
        if (null==plans){
            plans=new ArrayList<>();

        }
        return plans.add(plan);
    }

    public static ArrayList<Plan> getPlans() {
        return plans;
    }
    public static boolean removePlan(Plan plan){
        return plans.remove(plan);
    }
}
