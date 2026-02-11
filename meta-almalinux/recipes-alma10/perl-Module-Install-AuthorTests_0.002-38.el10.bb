
PN = "perl-Module-Install-AuthorTests"
PE = "0"
PV = "0.002"
PR = "38.el10"
PACKAGES = "perl-Module-Install-AuthorTests perl-Module-Install-AuthorTests-tests"


URI_perl-Module-Install-AuthorTests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-Install-AuthorTests-0.002-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-AuthorTests = " \
 perl-Module-Install \
 perl-vars \
 perl-libs \
 perl-Carp \
"

URI_perl-Module-Install-AuthorTests-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AuthorTests-tests-0.002-38.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-AuthorTests-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Module-Install-AuthorTests \
 bash \
 perl-interpreter \
"
