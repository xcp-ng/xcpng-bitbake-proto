
inherit dnf-bridge

PN = "spice-vdagent"
PE = "0"
PV = "0.22.1"
PR = "7.el10"
PACKAGES = "spice-vdagent"


URI_spice-vdagent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-vdagent-0.22.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-vdagent = " \
 alsa-lib \
 libXfixes \
 libpciaccess \
 systemd \
 systemd-libs \
 libXinerama \
 libXrandr \
 libX11 \
 bash \
 glib2 \
 glibc \
 dbus-libs \
 libdrm \
"
