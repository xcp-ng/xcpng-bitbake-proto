
PN = "opencryptoki"
PE = "0"
PV = "3.24.0"
PR = "6.el10_0"
PACKAGES = "opencryptoki opencryptoki-ccatok opencryptoki-icsftok opencryptoki-libs opencryptoki-swtok opencryptoki-devel"


URI_opencryptoki = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencryptoki = "/bin/sh ( ) coreutils ( ) systemd ( ) diffutils ( ) opencryptoki-libs(x86-64) ( =  3.24.0-6.el10_0) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libcap.so.2()(64bit) ( ) opencryptoki(token) ( ) selinux-policy ( if  selinux-policy-targeted)"
RPROVIDES:opencryptoki = "config(opencryptoki) ( =  3.24.0-6.el10_0) opencryptoki ( =  3.24.0-6.el10_0) opencryptoki(x86-64) ( =  3.24.0-6.el10_0)"

URI_opencryptoki-ccatok = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-ccatok-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencryptoki-ccatok = "opencryptoki-libs(x86-64) ( =  3.24.0-6.el10_0) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( )"
RPROVIDES:opencryptoki-ccatok = "opencryptoki(token) ( ) libpkcs11_cca.so.0()(64bit) ( ) libpkcs11_cca.so.0(OPENCRYPTOKI_TOK_3.10)(64bit) ( ) config(opencryptoki-ccatok) ( =  3.24.0-6.el10_0) opencryptoki-ccatok ( =  3.24.0-6.el10_0) opencryptoki-ccatok(x86-64) ( =  3.24.0-6.el10_0)"

URI_opencryptoki-icsftok = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-icsftok-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencryptoki-icsftok = "opencryptoki-libs(x86-64) ( =  3.24.0-6.el10_0) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( )"
RPROVIDES:opencryptoki-icsftok = "opencryptoki(token) ( ) libpkcs11_icsf.so.0()(64bit) ( ) libpkcs11_icsf.so.0(OPENCRYPTOKI_TOK_3.10)(64bit) ( ) opencryptoki-icsftok ( =  3.24.0-6.el10_0) opencryptoki-icsftok(x86-64) ( =  3.24.0-6.el10_0)"

URI_opencryptoki-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-libs-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencryptoki-libs = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( )"
RPROVIDES:opencryptoki-libs = "libopencryptoki.so.0()(64bit) ( ) libopencryptoki.so.0(OPENCRYPTOKI_3.10)(64bit) ( ) opencryptoki-libs(x86-64) ( =  3.24.0-6.el10_0) opencryptoki-libs ( =  3.24.0-6.el10_0)"

URI_opencryptoki-swtok = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opencryptoki-swtok-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencryptoki-swtok = "opencryptoki-libs(x86-64) ( =  3.24.0-6.el10_0) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( )"
RPROVIDES:opencryptoki-swtok = "opencryptoki(token) ( ) libpkcs11_sw.so.0()(64bit) ( ) libpkcs11_sw.so.0(OPENCRYPTOKI_TOK_3.10)(64bit) ( ) opencryptoki-swtok ( =  3.24.0-6.el10_0) opencryptoki-swtok(x86-64) ( =  3.24.0-6.el10_0)"

URI_opencryptoki-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opencryptoki-devel-3.24.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencryptoki-devel = "/usr/bin/pkg-config ( ) opencryptoki-libs(x86-64) ( =  3.24.0-6.el10_0)"
RPROVIDES:opencryptoki-devel = "pkgconfig(opencryptoki) ( =  3.24) opencryptoki-devel ( =  3.24.0-6.el10_0) opencryptoki-devel(x86-64) ( =  3.24.0-6.el10_0)"
