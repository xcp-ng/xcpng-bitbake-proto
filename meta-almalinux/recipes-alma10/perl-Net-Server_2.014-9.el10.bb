
inherit dnf-bridge

PN = "perl-Net-Server"
PE = "0"
PV = "2.014"
PR = "9.el10"
PACKAGES = "perl-Net-Server perl-Net-Server-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Net-Server-2.014-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Net-Server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-Server-2.014-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Net-Server}"
RDEPENDS:perl-Net-Server = " \
 perl-Net-Server \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-interpreter \
 perl-IO \
 perl-Socket \
 perl-IO-Multiplex \
 perl-Fcntl \
 perl-IO-Socket-IP \
 perl-POSIX \
 perl-Sys-Syslog \
 perl-Errno \
 perl-Exporter \
 perl-base \
 perl-File-Temp \
 perl-Time-HiRes \
"

URI_perl-Net-Server-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-Server-tests-2.014-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Net-Server-tests}"
RDEPENDS:perl-Net-Server-tests = " \
 perl-Net-Server \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-IO \
 perl-FindBin \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-English \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
