
inherit dnf-bridge

PN = "setroubleshoot"
PE = "0"
PV = "3.3.35"
PR = "1.el10"
PACKAGES = "setroubleshoot setroubleshoot-server"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/setroubleshoot-3.3.35-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_setroubleshoot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setroubleshoot-3.3.35-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_setroubleshoot}"
RDEPENDS:setroubleshoot = " \
 python3 \
 python3-gobject \
 desktop-file-utils \
 setroubleshoot-server \
 xdg-utils \
 python3-dasbus \
 dbus \
 gtk3 \
 libnotify \
"

URI_setroubleshoot-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setroubleshoot-server-3.3.35-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_setroubleshoot-server}"
RDEPENDS:setroubleshoot-server = " \
 python3 \
 policycoreutils-python-utils \
 python3-dbus \
 dbus \
 python3-gobject-base \
 dbus-libs \
 libselinux \
 setroubleshoot-plugins \
 python3-libselinux \
 libcap-ng \
 python3-libxml2 \
 python3-rpm \
 audit \
 audit-libs \
 python3-six \
 bash \
 python3-systemd \
 python3-audit \
 python3-dasbus \
 polkit \
 glibc \
 initscripts-service \
"
