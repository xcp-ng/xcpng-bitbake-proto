
inherit dnf-bridge

PN = "rtkit"
PE = "0"
PV = "0.11"
PR = "68.el10"
PACKAGES = "rtkit"


URI_rtkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rtkit-0.11-68.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rtkit = " \
 shadow-utils \
 systemd-libs \
 libcap \
 polkit \
 bash \
 dbus \
 glibc \
 dbus-libs \
"
