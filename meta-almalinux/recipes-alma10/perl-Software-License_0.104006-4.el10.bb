
inherit dnf-bridge

PN = "perl-Software-License"
PE = "0"
PV = "0.104006"
PR = "4.el10"
PACKAGES = "perl-Software-License perl-Software-License-tests"


URI_perl-Software-License = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Software-License-0.104006-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Software-License = " \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Software-License \
 perl-Module-Load \
 perl-Text-Template \
 perl-PathTools \
 perl-parent \
 perl-Data-Section \
"

URI_perl-Software-License-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Software-License-tests-0.104006-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Software-License-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-Try-Tiny \
 perl-Software-License \
 bash \
 perl-PathTools \
 perl-interpreter \
"
