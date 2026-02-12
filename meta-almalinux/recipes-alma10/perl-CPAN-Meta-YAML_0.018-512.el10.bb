
inherit dnf-bridge

PN = "perl-CPAN-Meta-YAML"
PE = "0"
PV = "0.018"
PR = "512.el10"
PACKAGES = "perl-CPAN-Meta-YAML perl-CPAN-Meta-YAML-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-CPAN-Meta-YAML-0.018-512.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-CPAN-Meta-YAML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-YAML-0.018-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-CPAN-Meta-YAML}"
RDEPENDS:perl-CPAN-Meta-YAML = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Fcntl \
 perl-B \
 perl-Exporter \
"

URI_perl-CPAN-Meta-YAML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-YAML-tests-0.018-512.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-CPAN-Meta-YAML-tests}"
RDEPENDS:perl-CPAN-Meta-YAML-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Getopt-Long \
 perl-Test-Harness \
 perl-Carp \
 perl-CPAN-Meta-YAML \
 perl-vars \
 perl-IO \
 perl-Test-Simple \
 perl-lib \
 bash \
 perl-Exporter \
 perl-base \
 perl-ExtUtils-MakeMaker \
 perl-File-Basename \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Temp \
"
