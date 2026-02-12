
inherit dnf-bridge

PN = "firewalld"
PE = "0"
PV = "2.3.1"
PR = "1.el10_0"
PACKAGES = "firewalld firewalld-filesystem python3-firewall firewall-applet firewall-config firewalld-test"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/firewalld-2.3.1-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_firewalld = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/firewalld-2.3.1-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_firewalld}"
RDEPENDS:firewalld = " \
 python3 \
 firewalld-filesystem \
 systemd \
 bash \
 python3-firewall \
"

URI_firewalld-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/firewalld-filesystem-2.3.1-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_firewalld-filesystem}"
RDEPENDS:firewalld-filesystem = ""

URI_python3-firewall = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-firewall-2.3.1-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-firewall}"
RDEPENDS:python3-firewall = " \
 python3-nftables \
 python3-dbus \
 python3 \
 python3-gobject-base \
"

URI_firewall-applet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/firewall-applet-2.3.1-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_firewall-applet}"
RDEPENDS:firewall-applet = " \
 python3 \
 python3-gobject \
 firewalld \
 python3-pyqt6-base \
 dbus-x11 \
 python3-firewall \
 hicolor-icon-theme \
 firewall-config \
 NetworkManager-libnm \
 libnotify \
"

URI_firewall-config = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/firewall-config-2.3.1-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_firewall-config}"
RDEPENDS:firewall-config = " \
 python3 \
 python3-gobject \
 dbus-x11 \
 python3-firewall \
 gtk3 \
 hicolor-icon-theme \
 NetworkManager-libnm \
 firewalld \
"

URI_firewalld-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/firewalld-test-2.3.1-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_firewalld-test}"
RDEPENDS:firewalld-test = " \
 bash \
"
