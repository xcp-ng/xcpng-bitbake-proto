
PN = "conmon"
PE = "3"
PV = "2.1.12"
PR = "4.el10"
PACKAGES = "conmon"


URI_conmon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/conmon-2.1.12-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:conmon = " \
 systemd-libs \
 libgcc \
 glib2 \
 libseccomp \
 glibc \
"
