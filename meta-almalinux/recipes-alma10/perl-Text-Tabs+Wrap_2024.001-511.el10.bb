
PN = "perl-Text-Tabs+Wrap"
PE = "0"
PV = "2024.001"
PR = "511.el10"
PACKAGES = "perl-Text-Tabs+Wrap perl-Text-Tabs+Wrap-tests"


URI_perl-Text-Tabs+Wrap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Tabs+Wrap-2024.001-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Tabs+Wrap = "
 perl-Exporter
 perl-libs
 perl-Text-Tabs+Wrap
"

URI_perl-Text-Tabs+Wrap-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Tabs+Wrap-tests-2024.001-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Tabs+Wrap-tests = "
 perl-Test-Harness
 perl-libs
 perl-Text-Tabs+Wrap
 bash
 perl-interpreter
"
