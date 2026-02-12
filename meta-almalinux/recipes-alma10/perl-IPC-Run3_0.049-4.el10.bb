
inherit dnf-bridge

PN = "perl-IPC-Run3"
PE = "0"
PV = "0.049"
PR = "4.el10"
PACKAGES = "perl-IPC-Run3 perl-IPC-Run3-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-IPC-Run3-0.049-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-IPC-Run3 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IPC-Run3-0.049-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IPC-Run3}"
RDEPENDS:perl-IPC-Run3 = " \
 perl-constant \
 perl-IPC-Run3 \
 perl-libs \
 perl-Carp \
 perl-POSIX \
 perl-Exporter \
 perl-File-Temp \
"

URI_perl-IPC-Run3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-Run3-tests-0.049-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IPC-Run3-tests}"
RDEPENDS:perl-IPC-Run3-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IPC-Run3 \
 bash \
 perl-interpreter \
"
