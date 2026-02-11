
PN = "crypto-policies"
PE = "0"
PV = "20250214"
PR = "1.gitfd9b9b9.el10_0.1"
PACKAGES = "crypto-policies crypto-policies-scripts crypto-policies-pq-preview"


URI_crypto-policies = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/crypto-policies-20250214-1.gitfd9b9b9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:crypto-policies = " \
 bash \
"

URI_crypto-policies-scripts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/crypto-policies-scripts-20250214-1.gitfd9b9b9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:crypto-policies-scripts = " \
 python3 \
 crypto-policies \
 bash \
"

URI_crypto-policies-pq-preview = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/crypto-policies-pq-preview-20250214-1.gitfd9b9b9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:crypto-policies-pq-preview = " \
 crypto-policies \
 oqsprovider \
 liboqs \
"
