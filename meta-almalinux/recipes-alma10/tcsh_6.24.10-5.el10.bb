
PN = "tcsh"
PE = "0"
PV = "6.24.10"
PR = "5.el10"
PACKAGES = "tcsh"


URI_tcsh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcsh-6.24.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tcsh = "
 libxcrypt
 grep
 bash
 ncurses-libs
 glibc
 coreutils
 sed
"
