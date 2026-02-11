
PN = "ksh"
PE = "3"
PV = "1.0.10"
PR = "5.el10_0.1"
PACKAGES = "ksh"


URI_ksh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ksh-1.0.10-5.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ksh = " \
 systemd \
 diffutils \
 grep \
 bash \
 glibc \
 coreutils \
 sed \
"
