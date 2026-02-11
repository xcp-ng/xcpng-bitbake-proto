
inherit dnf-bridge

PN = "sbd"
PE = "0"
PV = "1.5.2"
PR = "1.el10.5"
PACKAGES = "sbd sbd-tests"


URI_sbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sbd-1.5.2-1.el10.5.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbd = " \
 libqb \
 libuuid \
 systemd \
 libaio \
 pacemaker-libs \
 pacemaker-cluster-libs \
 corosynclib \
 pkgconf-pkg-config \
 bash \
 glib2 \
 glibc \
"

URI_sbd-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sbd-tests-1.5.2-1.el10.5.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbd-tests = " \
 libqb \
 libuuid \
 libaio \
 pacemaker-cluster-libs \
 pacemaker-libs \
 corosynclib \
 libxml2 \
 bash \
 glib2 \
 glibc \
"
