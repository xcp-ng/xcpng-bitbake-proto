
PN = "osbuild-composer"
PE = "0"
PV = "134.1"
PR = "3.el10_0.alma.1"
PACKAGES = "osbuild-composer osbuild-composer-core osbuild-composer-worker osbuild-composer-tests"


URI_osbuild-composer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-composer-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer = "/bin/sh ( ) systemd ( ) osbuild-composer-core ( =  134.1-3.el10_0.alma.1) osbuild-composer-worker ( =  134.1-3.el10_0.alma.1)"
RPROVIDES:osbuild-composer = "group(_osbuild-composer) ( ) weldr ( ) group(weldr) ( =  ZyB3ZWxkciAt) user(_osbuild-composer) ( =  dSBfb3NidWlsZC1jb21wb3NlciAtICJPU0J1aWxkIENvbXBvc2VyIHVzZXIi) osbuild-composer ( =  134.1-3.el10_0.alma.1) osbuild-composer(x86-64) ( =  134.1-3.el10_0.alma.1)"

URI_osbuild-composer-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-composer-core-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer-core = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) osbuild-depsolve-dnf ( >=  139) osbuild-dnf-json-api ( =  8)"
RPROVIDES:osbuild-composer-core = "osbuild-composer-core ( =  134.1-3.el10_0.alma.1) osbuild-composer-dnf-json ( =  134.1-3.el10_0.alma.1) osbuild-composer-core(x86-64) ( =  134.1-3.el10_0.alma.1)"

URI_osbuild-composer-worker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/osbuild-composer-worker-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer-worker = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) systemd ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) qemu-img ( ) osbuild-depsolve-dnf ( >=  139) osbuild ( >=  139) osbuild-luks2 ( >=  139) osbuild-lvm2 ( >=  139) osbuild-ostree ( >=  139)"
RPROVIDES:osbuild-composer-worker = "osbuild-composer-worker ( =  134.1-3.el10_0.alma.1) osbuild-composer-dnf-json ( =  134.1-3.el10_0.alma.1) osbuild-composer-worker(x86-64) ( =  134.1-3.el10_0.alma.1)"

URI_osbuild-composer-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/osbuild-composer-tests-134.1-3.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:osbuild-composer-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) /usr/bin/python3 ( ) python3 ( ) qemu-kvm ( ) podman ( ) libcrypt.so.2()(64bit) ( ) make ( ) qemu-img ( ) libresolv.so.2()(64bit) ( ) expect ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) openssl ( ) python3-lxml ( ) dnsmasq ( ) firewalld ( ) httpd ( ) container-selinux ( ) createrepo_c ( ) jq ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) libvirt-client ( ) libvirt-daemon-config-network ( ) libvirt-daemon-driver-network ( ) libvirt-daemon-driver-nodedev ( ) libvirt-daemon-driver-qemu ( ) libvirt-daemon-driver-storage-disk ( ) unzip ( ) virt-install ( ) composer-cli ( ) dnf-plugins-core ( ) krb5-workstation ( ) libvirt-daemon ( ) libvirt-daemon-config-nwfilter ( ) libvirt-daemon-driver-interface ( ) libvirt-daemon-driver-nwfilter ( ) libvirt-daemon-driver-secret ( ) libvirt-daemon-driver-storage ( ) libvirt-daemon-kvm ( ) mod_ssl ( ) python3-pip ( ) qemu-kvm-core ( ) rpmdevtools ( ) skopeo ( ) sssd-krb5 ( ) systemd-container ( ) xorriso ( ) osbuild-composer ( =  134.1-3.el10_0.alma.1)"
RPROVIDES:osbuild-composer-tests = "osbuild-composer-tests ( =  134.1-3.el10_0.alma.1) osbuild-composer-tests(x86-64) ( =  134.1-3.el10_0.alma.1)"
