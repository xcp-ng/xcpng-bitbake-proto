
PN = "mc"
PE = "1"
PV = "4.8.31"
PR = "3.el10"
PACKAGES = "mc mc-python"


URI_mc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mc-4.8.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mc = " \
 e2fsprogs-libs \
 perl-libs \
 slang \
 perl-POSIX \
 perl-File-Basename \
 bash \
 glib2 \
 glibc \
 perl-interpreter \
 perl-File-Temp \
"

URI_mc-python = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mc-python-4.8.31-3.el10.noarch.rpm;unpack=0"
RDEPENDS:mc-python = " \
 python3 \
 mc \
"
