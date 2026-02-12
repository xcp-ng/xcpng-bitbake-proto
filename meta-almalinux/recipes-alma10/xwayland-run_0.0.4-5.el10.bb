
inherit dnf-bridge

PN = "xwayland-run"
PE = "0"
PV = "0.0.4"
PR = "5.el10"
PACKAGES = "xwayland-run"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xwayland-run-0.0.4-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xwayland-run = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xwayland-run-0.0.4-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xwayland-run}"
RDEPENDS:xwayland-run = " \
 python3 \
 dbus-daemon \
 gnome-kiosk \
 xorg-x11-server-Xwayland \
 xorg-x11-xauth \
"
