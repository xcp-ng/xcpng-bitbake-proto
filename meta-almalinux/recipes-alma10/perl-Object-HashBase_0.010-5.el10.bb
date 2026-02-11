
PN = "perl-Object-HashBase"
PE = "0"
PV = "0.010"
PR = "5.el10"
PACKAGES = "perl-Object-HashBase perl-Object-HashBase-tests perl-Object-HashBase-tools"


URI_perl-Object-HashBase = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Object-HashBase-0.010-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-HashBase = " \
 perl-libs \
 perl-Carp \
"

URI_perl-Object-HashBase-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-HashBase-tests-0.010-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-HashBase-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Object-HashBase \
 bash \
 perl-interpreter \
 perl-Object-HashBase-tools \
 perl-File-Temp \
"

URI_perl-Object-HashBase-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-HashBase-tools-0.010-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-HashBase-tools = " \
 perl-Object-HashBase \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-interpreter \
 perl-Object-HashBase-tools \
 perl-base \
"
