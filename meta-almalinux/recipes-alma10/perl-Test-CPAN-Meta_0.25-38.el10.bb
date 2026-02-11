
PN = "perl-Test-CPAN-Meta"
PE = "0"
PV = "0.25"
PR = "38.el10"
PACKAGES = "perl-Test-CPAN-Meta perl-Test-CPAN-Meta-tests"


URI_perl-Test-CPAN-Meta = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-CPAN-Meta-0.25-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-CPAN-Meta = " \
 perl-CPAN-Meta \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Test-CPAN-Meta \
"

URI_perl-Test-CPAN-Meta-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-CPAN-Meta-tests-0.25-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-CPAN-Meta-tests = " \
 perl-CPAN-Meta \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IO \
 perl-Test-CPAN-Meta \
 bash \
 perl-interpreter \
"
