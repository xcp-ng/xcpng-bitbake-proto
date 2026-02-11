
PN = "perl-Term-Size-Any"
PE = "0"
PV = "0.002"
PR = "45.el10"
PACKAGES = "perl-Term-Size-Any perl-Term-Size-Any-tests"


URI_perl-Term-Size-Any = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Size-Any-0.002-45.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Any = "
 perl-libs
 perl-vars
 perl-Term-Size-Perl
"

URI_perl-Term-Size-Any-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Size-Any-tests-0.002-45.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Size-Any-tests = "
 perl-Test-Harness
 perl-Test-Simple
 perl-Module-Load-Conditional
 bash
 perl-interpreter
 perl-Term-Size-Any
"
