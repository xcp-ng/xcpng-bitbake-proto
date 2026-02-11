
PN = "perl-threads-shared"
PE = "0"
PV = "1.69"
PR = "511.el10"
PACKAGES = "perl-threads-shared perl-threads-shared-tests"


URI_perl-threads-shared = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-threads-shared-1.69-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-threads-shared = " \
 perl-threads \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 glibc \
"

URI_perl-threads-shared-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-threads-shared-tests-1.69-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-threads-shared-tests = " \
 perl-threads \
 perl-threads-shared \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Scalar-List-Utils \
 perl-ExtUtils-MakeMaker \
 perl-POSIX \
 bash \
 perl-interpreter \
 perl-Time-HiRes \
"
