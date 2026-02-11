
PN = "ipvsadm"
PE = "0"
PV = "1.31"
PR = "15.el10"
PACKAGES = "ipvsadm"


URI_ipvsadm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipvsadm-1.31-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipvsadm = " \
 systemd \
 libnl3 \
 bash \
 popt \
 glibc \
"
