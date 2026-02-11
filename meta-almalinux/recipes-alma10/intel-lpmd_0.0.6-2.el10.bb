
inherit dnf-bridge

PN = "intel-lpmd"
PE = "0"
PV = "0.0.6"
PR = "2.el10"
PACKAGES = "intel-lpmd"


URI_intel-lpmd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/intel-lpmd-0.0.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:intel-lpmd = " \
 systemd-libs \
 libgcc \
 libnl3 \
 libxml2 \
 bash \
 glib2 \
 glibc \
"
