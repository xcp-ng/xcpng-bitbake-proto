
PN = "linuxptp"
PE = "0"
PV = "4.4"
PR = "2.el10"
PACKAGES = "linuxptp linuxptp-selinux"


URI_linuxptp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/linuxptp-4.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:linuxptp = "
 systemd
 gnutls
 linuxptp-selinux
 bash
 glibc
"

URI_linuxptp-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/linuxptp-selinux-4.4-2.el10.noarch.rpm;unpack=0"
RDEPENDS:linuxptp-selinux = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 selinux-policy-targeted
"
