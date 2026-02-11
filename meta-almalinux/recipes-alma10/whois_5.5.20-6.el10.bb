
inherit dnf-bridge

PN = "whois"
PE = "0"
PV = "5.5.20"
PR = "6.el10"
PACKAGES = "mkpasswd whois whois-nls"


URI_mkpasswd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mkpasswd-5.5.20-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mkpasswd = " \
 glibc \
 libxcrypt \
 whois-nls \
"

URI_whois = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/whois-5.5.20-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:whois = " \
 whois-nls \
 bash \
 glibc \
 alternatives \
 libidn2 \
"

URI_whois-nls = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/whois-nls-5.5.20-6.el10.noarch.rpm;unpack=0"
RDEPENDS:whois-nls = ""
