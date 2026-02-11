
inherit dnf-bridge

PN = "perl-Sub-Install"
PE = "0"
PV = "0.929"
PR = "8.el10"
PACKAGES = "perl-Sub-Install perl-Sub-Install-tests"


URI_perl-Sub-Install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sub-Install-0.929-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Install = " \
 perl-B \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
"

URI_perl-Sub-Install-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Install-tests-0.929-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Install-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-Scalar-List-Utils \
 perl-Sub-Install \
 bash \
 perl-PathTools \
 perl-interpreter \
"
