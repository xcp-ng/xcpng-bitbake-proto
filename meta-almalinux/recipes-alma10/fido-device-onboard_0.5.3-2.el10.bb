
PN = "fido-device-onboard"
PE = "0"
PV = "0.5.3"
PR = "2.el10"
PACKAGES = "fdo-admin-cli fdo-client fdo-init fdo-manufacturing-server fdo-owner-cli fdo-owner-onboarding-server fdo-rendezvous-server"


URI_fdo-admin-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-admin-cli-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-admin-cli = " \
 openssl-libs \
 libgcc \
 bash \
 fdo-client \
 tpm2-tss \
 glibc \
 fdo-init \
 fdo-manufacturing-server \
 fdo-owner-cli \
 fdo-owner-onboarding-server \
 fdo-rendezvous-server \
"

URI_fdo-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-client-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-client = " \
 cryptsetup \
 cryptsetup-libs \
 openssl-libs \
 libgcc \
 clevis \
 bash \
 clevis-luks \
 clevis-pin-tpm2 \
 tpm2-tss \
 glibc \
"

URI_fdo-init = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-init-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-init = " \
 openssl-libs \
 libgcc \
 bash \
 dracut \
 tpm2-tss \
 glibc \
"

URI_fdo-manufacturing-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-manufacturing-server-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-manufacturing-server = " \
 libpq \
 openssl-libs \
 libgcc \
 sqlite-libs \
 bash \
 tpm2-tss \
 glibc \
"

URI_fdo-owner-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-owner-cli-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-owner-cli = " \
 libpq \
 openssl-libs \
 libgcc \
 sqlite-libs \
 tpm2-tss \
 glibc \
"

URI_fdo-owner-onboarding-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-owner-onboarding-server-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-owner-onboarding-server = " \
 libpq \
 openssl-libs \
 libgcc \
 sqlite-libs \
 bash \
 tpm2-tss \
 glibc \
"

URI_fdo-rendezvous-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdo-rendezvous-server-0.5.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdo-rendezvous-server = " \
 libpq \
 openssl-libs \
 libgcc \
 sqlite-libs \
 bash \
 tpm2-tss \
 glibc \
"
