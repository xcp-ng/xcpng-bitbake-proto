
PN = "telnet"
PE = "1"
PV = "0.17"
PR = "94.el10"
PACKAGES = "telnet telnet-server"


URI_telnet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/telnet-0.17-94.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:telnet = " \
 glibc \
 ncurses-libs \
"

URI_telnet-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/telnet-server-0.17-94.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:telnet-server = " \
 glibc \
 systemd \
 bash \
"
