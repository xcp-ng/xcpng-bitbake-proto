
inherit dnf-bridge

PN = "perl-IO-All"
PE = "0"
PV = "0.87"
PR = "26.el10"
PACKAGES = "perl-IO-All perl-IO-All-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-IO-All-0.87-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-IO-All = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-All-0.87-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-All}"
RDEPENDS:perl-IO-All = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-File-ReadBackwards \
 perl-Fcntl \
 perl-POSIX \
 perl-overload \
 perl-File-Copy \
 perl-PathTools \
 perl-Symbol \
 perl-Tie-File \
 perl-File-MimeInfo \
 perl-File-Path \
 perl-IO-All \
"

URI_perl-IO-All-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-All-tests-0.87-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-All-tests}"
RDEPENDS:perl-IO-All-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-diagnostics \
 perl-FindBin \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-base \
 perl-IO-All \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-Exporter \
 perl-lib \
 perl-Test-Pod \
"
