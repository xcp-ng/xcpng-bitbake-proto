
PN = "tftp"
PE = "0"
PV = "5.2"
PR = "48.el10"
PACKAGES = "tftp tftp-server"


URI_tftp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tftp-5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tftp = " \
 glibc \
 readline \
"

URI_tftp-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tftp-server-5.2-48.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tftp-server = " \
 glibc \
 systemd \
 bash \
"
