
PN = "perl-CPAN-Meta"
PE = "0"
PV = "2.150010"
PR = "511.el10"
PACKAGES = "perl-CPAN-Meta perl-CPAN-Meta-tests"


URI_perl-CPAN-Meta = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-Meta-2.150010-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta = " \
 perl-CPAN-Meta \
 perl-CPAN-Meta-Requirements \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-CPAN-Meta-YAML \
 perl-version \
 perl-Encode \
 perl-JSON-PP \
 perl-Exporter \
"

URI_perl-CPAN-Meta-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-Meta-tests-2.150010-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-Meta-tests = " \
 perl-CPAN-Meta \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-vars \
 perl-Scalar-List-Utils \
 perl-IO \
 perl-Test-Simple \
 perl-Storable \
 perl-File-Basename \
 perl-overload \
 perl-File-Temp \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
 perl-lib \
"
