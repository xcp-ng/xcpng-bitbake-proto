
PN = "tpm2-tss"
PE = "0"
PV = "4.1.3"
PR = "5.el10"
PACKAGES = "tpm2-tss tpm2-tss-fapi tpm2-tss-devel"


URI_tpm2-tss = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tpm2-tss-4.1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tss = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( )"
RPROVIDES:tpm2-tss = "libtss2-esys.so.0()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libtss2-sys.so.1()(64bit) ( ) group(tss) ( ) libtss2-policy.so.0()(64bit) ( ) libtss2-tcti-cmd.so.0()(64bit) ( ) libtss2-tcti-device.so.0()(64bit) ( ) libtss2-tcti-i2c-helper.so.0()(64bit) ( ) libtss2-tcti-mssim.so.0()(64bit) ( ) libtss2-tcti-pcap.so.0()(64bit) ( ) libtss2-tcti-spi-helper.so.0()(64bit) ( ) libtss2-tcti-spidev.so.0()(64bit) ( ) libtss2-tcti-swtpm.so.0()(64bit) ( ) tpm2-tss(x86-64) ( =  4.1.3-5.el10) tpm2-tss ( =  4.1.3-5.el10) user(tss) ( =  dSB0c3MgNTkgIkFjY291bnQgdXNlZCBmb3IgVFBNIGFjY2VzcyIgLSAt)"

URI_tpm2-tss-fapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tpm2-tss-fapi-4.1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tss-fapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libtss2-esys.so.0()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libtss2-sys.so.1()(64bit) ( ) tpm2-tss(x86-64) ( =  4.1.3-5.el10)"
RPROVIDES:tpm2-tss-fapi = "libtss2-fapi.so.1()(64bit) ( ) tpm2-tss-fapi ( =  4.1.3-5.el10) tpm2-tss-fapi(x86-64) ( =  4.1.3-5.el10)"

URI_tpm2-tss-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tpm2-tss-devel-4.1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tss-devel = "/usr/bin/pkg-config ( ) pkgconfig(libcrypto) ( ) pkgconfig(libcurl) ( ) pkgconfig(uuid) ( ) pkgconfig(json-c) ( ) pkgconfig(tss2-mu) ( ) pkgconfig(tss2-sys) ( ) pkgconfig(tss2-esys) ( ) pkgconfig(tss2-tctildr) ( ) libtss2-esys.so.0()(64bit) ( ) libtss2-fapi.so.1()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libtss2-policy.so.0()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) libtss2-sys.so.1()(64bit) ( ) libtss2-tcti-cmd.so.0()(64bit) ( ) libtss2-tcti-device.so.0()(64bit) ( ) libtss2-tcti-i2c-helper.so.0()(64bit) ( ) libtss2-tcti-mssim.so.0()(64bit) ( ) libtss2-tcti-pcap.so.0()(64bit) ( ) libtss2-tcti-spi-helper.so.0()(64bit) ( ) libtss2-tcti-spidev.so.0()(64bit) ( ) libtss2-tcti-swtpm.so.0()(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) tpm2-tss(x86-64) ( =  4.1.3-5.el10) tpm2-tss-fapi(x86-64) ( =  4.1.3-5.el10)"
RPROVIDES:tpm2-tss-devel = "pkgconfig(tss2-esys) ( =  4.1.3) pkgconfig(tss2-fapi) ( =  4.1.3) pkgconfig(tss2-mu) ( =  4.1.3) pkgconfig(tss2-policy) ( =  4.1.3) pkgconfig(tss2-rc) ( =  4.1.3) pkgconfig(tss2-sys) ( =  4.1.3) pkgconfig(tss2-tcti-cmd) ( =  4.1.3) pkgconfig(tss2-tcti-device) ( =  4.1.3) pkgconfig(tss2-tcti-i2c-helper) ( =  4.1.3) pkgconfig(tss2-tcti-mssim) ( =  4.1.3) pkgconfig(tss2-tcti-pcap) ( =  4.1.3) pkgconfig(tss2-tcti-spi-helper) ( =  4.1.3) pkgconfig(tss2-tcti-spidev) ( =  4.1.3) pkgconfig(tss2-tcti-swtpm) ( =  4.1.3) pkgconfig(tss2-tctildr) ( =  4.1.3) tpm2-tss-devel ( =  4.1.3-5.el10) tpm2-tss-devel(x86-64) ( =  4.1.3-5.el10)"
