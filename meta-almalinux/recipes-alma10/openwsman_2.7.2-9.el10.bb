
PN = "openwsman"
PE = "0"
PV = "2.7.2"
PR = "9.el10"
PACKAGES = "libwsman1 openwsman-python3 openwsman-selinux openwsman-server libwsman-devel openwsman-client openwsman-perl openwsman-winrs rubygem-openwsman rubygem-openwsman-doc"


URI_libwsman1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwsman1-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwsman1 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libcurl.so.4()(64bit) ( )"
RPROVIDES:libwsman1 = "libwsman.so.1()(64bit) ( ) libwsman_client.so.5()(64bit) ( ) libwsman_curl_client_transport.so.1()(64bit) ( ) libwsman1 ( =  2.7.2-9.el10) libwsman1(x86-64) ( =  2.7.2-9.el10) openwsman ( =  2.7.2-9.el10)"

URI_openwsman-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openwsman-python3-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-python3 = "rtld(GNU_HASH) ( ) /usr/bin/python3 ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libwsman.so.1()(64bit) ( ) libwsman_client.so.5()(64bit) ( ) libwsman_curl_client_transport.so.1()(64bit) ( ) python(abi) ( =  3.12) libwsman1 ( =  2.7.2-9.el10)"
RPROVIDES:openwsman-python3 = "openwsman-python3 ( =  2.7.2-9.el10) openwsman-python3(x86-64) ( =  2.7.2-9.el10) python-openwsman ( =  2.7.2-9.el10) python3.12-openwsman ( =  2.7.2-9.el10)"

URI_openwsman-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openwsman-selinux-2.7.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:openwsman-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.13) selinux-policy ( >=  40.13.13)"
RPROVIDES:openwsman-selinux = "openwsman-selinux ( =  2.7.2-9.el10)"

URI_openwsman-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openwsman-server-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-server = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libruby.so.3.3()(64bit) ( ) libwsman.so.1()(64bit) ( ) libcmpisfcc.so.1()(64bit) ( ) libcmpisfcc.so.1(CMPISFCC_2.0)(64bit) ( ) libwsman1 ( =  2.7.2-9.el10) openwsman-selinux ( if  selinux-policy-targeted)"
RPROVIDES:openwsman-server = "libredirect.so.1()(64bit) ( ) libwsman_cim_plugin.so.1()(64bit) ( ) libwsman_file_auth.so.1()(64bit) ( ) libwsman_identify_plugin.so.1()(64bit) ( ) libwsman_pam_auth.so.1()(64bit) ( ) libwsman_ruby_plugin.so()(64bit) ( ) libwsman_server.so.1()(64bit) ( ) libwsman_test.so.1()(64bit) ( ) config(openwsman-server) ( =  2.7.2-9.el10) openwsman-server ( =  2.7.2-9.el10) openwsman-server(x86-64) ( =  2.7.2-9.el10)"

URI_libwsman-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwsman-devel-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwsman-devel = "/usr/bin/pkg-config ( ) pam-devel ( ) sblim-sfcc-devel ( ) libwsman_clientpp.so.1()(64bit) ( ) libxml2-devel ( ) libcurl-devel ( ) libwsman.so.1()(64bit) ( ) libwsman_client.so.5()(64bit) ( ) libwsman_curl_client_transport.so.1()(64bit) ( ) libwsman_server.so.1()(64bit) ( ) openwsman-client ( =  2.7.2-9.el10) libwsman1 ( =  2.7.2-9.el10) openwsman-server ( =  2.7.2-9.el10)"
RPROVIDES:libwsman-devel = "libwsman-devel ( =  2.7.2-9.el10) libwsman-devel(x86-64) ( =  2.7.2-9.el10) openwsman-devel ( =  2.7.2-9.el10) pkgconfig(openwsman) ( =  2.7.2) pkgconfig(openwsman++) ( =  2.7.2) pkgconfig(openwsman-server) ( =  2.7.2)"

URI_openwsman-client = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openwsman-client-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-client = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( )"
RPROVIDES:openwsman-client = "libwsman_clientpp.so.1()(64bit) ( ) openwsman-client ( =  2.7.2-9.el10) config(openwsman-client) ( =  2.7.2-9.el10) openwsman-client(x86-64) ( =  2.7.2-9.el10)"

URI_openwsman-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openwsman-perl-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-perl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(Exporter) ( ) perl(vars) ( ) perl-libs ( ) perl(base) ( ) perl(overload) ( ) perl(DynaLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libwsman.so.1()(64bit) ( ) libwsman_client.so.5()(64bit) ( ) libwsman_curl_client_transport.so.1()(64bit) ( ) libwsman1 ( =  2.7.2-9.el10)"
RPROVIDES:openwsman-perl = "perl(openwsman) ( ) perl(openwsman::Client) ( ) perl(openwsman::ClientOptions) ( ) perl(openwsman::Context) ( ) perl(openwsman::EndPointReference) ( ) perl(openwsman::EnumerateInfo) ( ) perl(openwsman::Fault) ( ) perl(openwsman::Filter) ( ) perl(openwsman::Soap) ( ) perl(openwsman::SoapOp) ( ) perl(openwsman::Status) ( ) perl(openwsman::Transport) ( ) perl(openwsman::XmlAttr) ( ) perl(openwsman::XmlDoc) ( ) perl(openwsman::XmlNode) ( ) perl(openwsman::XmlNs) ( ) perl(openwsmanc) ( ) openwsman-perl ( =  2.7.2-9.el10) openwsman-perl(x86-64) ( =  2.7.2-9.el10)"

URI_openwsman-winrs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openwsman-winrs-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-winrs = "/usr/bin/ruby ( ) rubygem-openwsman ( =  2.7.2-9.el10)"
RPROVIDES:openwsman-winrs = "openwsman-winrs ( =  2.7.2-9.el10) openwsman-winrs(x86-64) ( =  2.7.2-9.el10)"

URI_rubygem-openwsman = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-openwsman-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-openwsman = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libruby.so.3.3()(64bit) ( ) libwsman.so.1()(64bit) ( ) libwsman_client.so.5()(64bit) ( ) libwsman1 ( =  2.7.2-9.el10) ruby(rubygems) ( >=  1.3.6)"
RPROVIDES:rubygem-openwsman = "rubygem-openwsman ( =  2.7.2-9.el10) rubygem(openwsman) ( =  2.7.2) rubygem-openwsman(x86-64) ( =  2.7.2-9.el10)"

URI_rubygem-openwsman-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-openwsman-doc-2.7.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-openwsman-doc = "rubygem-openwsman ( =  2.7.2-9.el10)"
RPROVIDES:rubygem-openwsman-doc = "rubygem-openwsman-doc ( =  2.7.2-9.el10)"
