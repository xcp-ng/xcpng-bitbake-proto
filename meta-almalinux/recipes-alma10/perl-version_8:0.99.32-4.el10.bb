
inherit dnf-bridge

PN = "perl-version"
PE = "8"
PV = "0.99.32"
PR = "4.el10"
PACKAGES = "perl-version perl-version-tests"


URI_perl-version = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-version-0.99.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-version = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-version \
 perl-locale \
 perl-POSIX \
 perl-B \
 perl-overload \
 perl-if \
 glibc \
"

URI_perl-version-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-version-tests-0.99.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-version-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Scalar-List-Utils \
 perl-I18N-Langinfo \
 perl-version \
 perl-File-Basename \
 perl-POSIX \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-if \
 perl-interpreter \
 perl-Data-Dumper \
 perl-base \
 perl-lib \
"
