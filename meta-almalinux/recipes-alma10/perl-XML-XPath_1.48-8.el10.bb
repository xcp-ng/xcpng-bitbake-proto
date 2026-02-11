
inherit dnf-bridge

PN = "perl-XML-XPath"
PE = "0"
PV = "1.48"
PR = "8.el10"
PACKAGES = "perl-XML-XPath perl-XML-XPath-tests"


URI_perl-XML-XPath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-XPath-1.48-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-XPath = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-IO \
 perl-I18N-Langinfo \
 perl-POSIX \
 perl-open \
 perl-Encode \
 perl-overload \
 perl-XML-Parser \
 perl-parent \
 perl-XML-XPath \
 perl-Exporter \
 perl-Data-Dumper \
"

URI_perl-XML-XPath-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-XPath-tests-1.48-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-XPath-tests = " \
 perl-constant \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-I18N-Langinfo \
 perl-open \
 perl-Encode \
 bash \
 perl-XML-XPath \
 perl-interpreter \
 perl-Data-Dumper \
"
