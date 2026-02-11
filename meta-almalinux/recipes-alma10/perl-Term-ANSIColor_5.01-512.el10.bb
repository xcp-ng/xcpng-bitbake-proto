
PN = "perl-Term-ANSIColor"
PE = "0"
PV = "5.01"
PR = "512.el10"
PACKAGES = "perl-Term-ANSIColor perl-Term-ANSIColor-tests"


URI_perl-Term-ANSIColor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-ANSIColor-5.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-ANSIColor = " \
 perl-Exporter \
 perl-libs \
"

URI_perl-Term-ANSIColor-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-ANSIColor-tests-5.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-ANSIColor-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-File-Temp \
 perl-overload \
 bash \
 perl-base \
 perl-Term-ANSIColor \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
