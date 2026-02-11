
PN = "perl-IO-stringy"
PE = "0"
PV = "2.113"
PR = "17.el10"
PACKAGES = "perl-IO-stringy perl-IO-stringy-tests"


URI_perl-IO-stringy = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-stringy-2.113-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-stringy = " \
 perl-IO-stringy \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-FileHandle \
 perl-overload \
 perl-Symbol \
 perl-parent \
 perl-Exporter \
"

URI_perl-IO-stringy-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-stringy-tests-2.113-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-stringy-tests = " \
 perl-IO-stringy \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-IO \
 perl-Symbol \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
