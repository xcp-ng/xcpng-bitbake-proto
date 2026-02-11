
PN = "perl-CPAN-Meta-Check"
PE = "0"
PV = "0.018"
PR = "6.el10"
PACKAGES = "perl-CPAN-Meta-Check perl-CPAN-Meta-Check-tests"


URI_perl-CPAN-Meta-Check = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-Check-0.018-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-Check = " \
 perl-CPAN-Meta \
 perl-CPAN-Meta-Requirements \
 perl-libs \
 perl-Module-Metadata \
 perl-Exporter \
 perl-base \
"

URI_perl-CPAN-Meta-Check-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-Check-tests-0.018-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-Check-tests = " \
 perl-CPAN-Meta \
 perl-CPAN-Meta-Check \
 perl-Test-Harness \
 perl-libs \
 perl-Scalar-List-Utils \
 perl-Test-Simple \
 perl-IO \
 perl-Module-Metadata \
 perl-IPC-Open3 \
 perl-PathTools \
 bash \
 perl-Env \
 perl-interpreter \
 perl-lib \
"
