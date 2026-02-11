
PN = "perl-Module-Load-Conditional"
PE = "0"
PV = "0.74"
PR = "511.el10"
PACKAGES = "perl-Module-Load-Conditional perl-Module-Load-Conditional-tests"


URI_perl-Module-Load-Conditional = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Load-Conditional-0.74-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Load-Conditional = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-FileHandle \
 perl-version \
 perl-Module-CoreList \
 perl-Module-Load \
 perl-Params-Check \
 perl-Module-Metadata \
 perl-PathTools \
 perl-Exporter \
 perl-Locale-Maketext-Simple \
"

URI_perl-Module-Load-Conditional-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Load-Conditional-tests-0.74-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Load-Conditional-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-FindBin \
 perl-Module-Load-Conditional \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
