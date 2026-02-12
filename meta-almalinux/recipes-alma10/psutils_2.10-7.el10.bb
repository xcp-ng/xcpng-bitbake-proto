
inherit dnf-bridge

PN = "psutils"
PE = "0"
PV = "2.10"
PR = "7.el10"
PACKAGES = "psutils psutils-tests"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/psutils-2.10-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_psutils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psutils-2.10-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_psutils}"
RDEPENDS:psutils = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-IPC-Run3 \
 perl-Fcntl \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-POSIX \
 paper \
 perl-File-Copy \
 perl-PathTools \
 perl-Exporter \
 perl-interpreter \
 perl-base \
 perl-File-Temp \
"

URI_psutils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psutils-tests-2.10-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_psutils-tests}"
RDEPENDS:psutils-tests = " \
 diffutils \
 make \
 bash \
 coreutils \
 psutils \
"
