
PN = "perl-XML-NamespaceSupport"
PE = "0"
PV = "1.12"
PR = "25.el10"
PACKAGES = "perl-XML-NamespaceSupport perl-XML-NamespaceSupport-tests"


URI_perl-XML-NamespaceSupport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-NamespaceSupport-1.12-25.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-NamespaceSupport = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(vars) ( ) perl(constant) ( )"
RPROVIDES:perl-XML-NamespaceSupport = "perl(XML::NamespaceSupport) ( =  1.12) perl-XML-NamespaceSupport ( =  1.12-25.el10)"

URI_perl-XML-NamespaceSupport-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-NamespaceSupport-tests-1.12-25.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-NamespaceSupport-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(constant) ( ) perl(XML::NamespaceSupport) ( ) perl-XML-NamespaceSupport ( =  1.12-25.el10)"
RPROVIDES:perl-XML-NamespaceSupport-tests = "perl-XML-NamespaceSupport-tests ( =  1.12-25.el10)"
