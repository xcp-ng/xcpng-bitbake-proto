
inherit dnf-bridge

PN = "startup-notification"
PE = "0"
PV = "0.12"
PR = "31.el10"
PACKAGES = "startup-notification startup-notification-devel"


URI_startup-notification = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/startup-notification-0.12-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:startup-notification = " \
 libX11 \
 libxcb \
 libX11-xcb \
 glibc \
 xcb-util \
"

URI_startup-notification-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/startup-notification-devel-0.12-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:startup-notification-devel = " \
 libX11-devel \
 pkgconf-pkg-config \
 startup-notification \
"
