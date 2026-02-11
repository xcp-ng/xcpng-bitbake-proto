
inherit dnf-bridge

PN = "pptp"
PE = "0"
PV = "1.10.0"
PR = "22.el10"
PACKAGES = "pptp pptp-setup"


URI_pptp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pptp-1.10.0-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pptp = " \
 glibc \
 systemd \
 iproute \
 ppp \
"

URI_pptp-setup = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pptp-setup-1.10.0-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pptp-setup = " \
 perl-libs \
 perl-vars \
 perl-Getopt-Long \
 perl-interpreter \
 pptp \
"
