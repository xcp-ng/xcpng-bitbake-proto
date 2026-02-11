
PN = "firewalld"
PE = "0"
PV = "2.3.1"
PR = "1.el10_0"
PACKAGES = "firewalld firewalld-filesystem python3-firewall firewall-applet firewall-config firewalld-test"


URI_firewalld = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/firewalld-2.3.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:firewalld = "/bin/sh ( ) systemd ( ) /usr/bin/bash ( ) /usr/bin/python3 ( ) firewalld-filesystem ( =  2.3.1-1.el10_0) python3-firewall ( =  2.3.1-1.el10_0)"
RPROVIDES:firewalld = "config(firewalld) ( =  2.3.1-1.el10_0) firewalld ( =  2.3.1-1.el10_0)"

URI_firewalld-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/firewalld-filesystem-2.3.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:firewalld-filesystem = ""
RPROVIDES:firewalld-filesystem = "rpm_macro(firewalld_reload) ( ) firewalld-filesystem ( =  2.3.1-1.el10_0)"

URI_python3-firewall = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-firewall-2.3.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-firewall = "python3-dbus ( ) python3-gobject-base ( ) python3-nftables ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-firewall = "python3-firewall ( =  2.3.1-1.el10_0) python-firewall ( =  2.3.1-1.el10_0) python3.12-firewall ( =  2.3.1-1.el10_0)"

URI_firewall-applet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/firewall-applet-2.3.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:firewall-applet = "/usr/bin/python3 ( ) hicolor-icon-theme ( ) python3-gobject ( ) libnotify ( ) dbus-x11 ( ) NetworkManager-libnm ( ) python3-pyqt6-base ( ) firewalld ( =  2.3.1-1.el10_0) python3-firewall ( =  2.3.1-1.el10_0) firewall-config ( =  2.3.1-1.el10_0)"
RPROVIDES:firewall-applet = "config(firewall-applet) ( =  2.3.1-1.el10_0) firewall-applet ( =  2.3.1-1.el10_0)"

URI_firewall-config = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/firewall-config-2.3.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:firewall-config = "/usr/bin/python3 ( ) hicolor-icon-theme ( ) python3-gobject ( ) gtk3 ( ) dbus-x11 ( ) NetworkManager-libnm ( ) firewalld ( =  2.3.1-1.el10_0) python3-firewall ( =  2.3.1-1.el10_0)"
RPROVIDES:firewall-config = "metainfo() ( ) application() ( ) application(firewall-config.desktop) ( ) metainfo(firewall-config.appdata.xml) ( ) firewall-config ( =  2.3.1-1.el10_0)"

URI_firewalld-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/firewalld-test-2.3.1-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:firewalld-test = "/usr/bin/sh ( )"
RPROVIDES:firewalld-test = "firewalld-test ( =  2.3.1-1.el10_0)"
