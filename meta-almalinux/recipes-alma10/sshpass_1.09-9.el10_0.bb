
inherit dnf-bridge

PN = "sshpass"
PE = "0"
PV = "1.09"
PR = "9.el10_0"
PACKAGES = "sshpass"


URI_sshpass = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sshpass-1.09-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:sshpass = " \
 glibc \
"
