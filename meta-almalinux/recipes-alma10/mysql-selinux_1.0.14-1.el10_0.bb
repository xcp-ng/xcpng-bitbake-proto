
PN = "mysql-selinux"
PE = "0"
PV = "1.0.14"
PR = "1.el10_0"
PACKAGES = "mysql-selinux"


URI_mysql-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql-selinux-1.0.14-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mysql-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"
