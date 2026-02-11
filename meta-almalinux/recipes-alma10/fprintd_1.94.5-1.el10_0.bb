
PN = "fprintd"
PE = "0"
PV = "1.94.5"
PR = "1.el10_0"
PACKAGES = "fprintd fprintd-pam fprintd-devel"


URI_fprintd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fprintd-1.94.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:fprintd = "
 libgcc
 polkit-libs
 glib2
 glibc
 libfprint
"

URI_fprintd-pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fprintd-pam-1.94.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:fprintd-pam = "
 systemd-libs
 libgcc
 authselect
 pam-libs
 bash
 fprintd
 glibc
"

URI_fprintd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fprintd-devel-1.94.5-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:fprintd-devel = "
 fprintd
"
