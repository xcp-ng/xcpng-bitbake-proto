
inherit dnf-bridge

PN = "perl-CPAN-Meta-Requirements"
PE = "0"
PV = "2.143"
PR = "11.el10"
PACKAGES = "perl-CPAN-Meta-Requirements perl-CPAN-Meta-Requirements-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-CPAN-Meta-Requirements-2.143-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-CPAN-Meta-Requirements = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-Requirements-2.143-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-CPAN-Meta-Requirements}"
RDEPENDS:perl-CPAN-Meta-Requirements = " \
 perl-CPAN-Meta-Requirements \
 perl-libs \
 perl-Carp \
 perl-version \
 perl-B \
"

URI_perl-CPAN-Meta-Requirements-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-Requirements-tests-2.143-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-CPAN-Meta-Requirements-tests}"
RDEPENDS:perl-CPAN-Meta-Requirements-tests = " \
 perl-CPAN-Meta-Requirements \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-version \
 perl-PathTools \
 bash \
 perl-interpreter \
"
