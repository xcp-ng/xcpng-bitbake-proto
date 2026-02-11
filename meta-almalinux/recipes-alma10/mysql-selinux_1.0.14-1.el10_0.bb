
PN = "mysql-selinux"
PE = "0"
PV = "1.0.14"
PR = "1.el10_0"
PACKAGES = "mysql-selinux"


URI_mysql-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql-selinux-1.0.14-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mysql-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.26) selinux-policy ( >=  40.13.26)"
RPROVIDES:mysql-selinux = "mysql-selinux ( =  1.0.14-1.el10_0)"
